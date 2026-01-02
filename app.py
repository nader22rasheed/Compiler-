from flask import Flask, render_template, request, redirect, url_for, abort
import os, json

app = Flask(__name__, template_folder='templates', static_folder='static')

DATA_FILE = os.path.join(os.path.dirname(__file__), 'products.json')

# load/save helper
def load_products():
    if os.path.exists(DATA_FILE):
        try:
            with open(DATA_FILE, 'r', encoding='utf-8') as f:
                return json.load(f)
        except:
            return []
    return []

def save_products(prod_list):
    with open(DATA_FILE, 'w', encoding='utf-8') as f:
        json.dump(prod_list, f, ensure_ascii=False, indent=2)

# initial data (will be overwritten by file if exists)
products = load_products()
if not products:
    products = [
        {'id': 1, 'name': 'منتج 1', 'price': 100.0, 'description': 'وصف المنتج 1', 'image': None},
        {'id': 2, 'name': 'منتج 2', 'price': 200.0, 'description': 'وصف المنتج 2', 'image': None},
        {'id': 3, 'name': 'منتج 3', 'price': 300.0, 'description': 'وصف المنتج 3', 'image': None},
    ]
    save_products(products)

_next_id = max([p['id'] for p in products]) + 1 if products else 1

@app.route('/')
def index():
    return render_template('index.html', products=products)

@app.route('/add', methods=['GET', 'POST'])
def add_product():
    global _next_id
    if request.method == 'POST':
        name = request.form.get('name', '').strip()
        price = float(request.form.get('price', '0') or 0)
        desc = request.form.get('description', '').strip()
        new_product = {'id': _next_id, 'name': name, 'price': price, 'description': desc, 'image': None}
        products.append(new_product)
        _next_id += 1
        save_products(products)
        return redirect(url_for('index'))
    return render_template('add.html')

@app.route('/product/<int:product_id>')
def product_details(product_id):
    p = next((x for x in products if x['id'] == product_id), None)
    if not p:
        abort(404)
    return render_template('details.html', product=p)

@app.route('/product/<int:product_id>/delete', methods=['POST'])
def delete_product(product_id):
    global products
    p = next((x for x in products if x['id'] == product_id), None)
    if not p:
        abort(404)
    products = [x for x in products if x['id'] != product_id]
    save_products(products)
    return redirect(url_for('index'))

if __name__ == '__main__':
    app.run(host='127.0.0.1', port=5000, debug=True)
