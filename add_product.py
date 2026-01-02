from flask import Flask, render_template, request, redirect, url_for

app = Flask(__name__)

products = []

@app.route('/add', methods=['GET', 'POST'])
def add_product():
    if request.method == 'POST':
        name = request.form['name']
        price = float(request.form['price'])
        description = request.form['description']
        image = request.form['image']
        new_id = len(products) + 1
        products.append({'id': new_id, 'name': name, 'price': price, 'description': description, 'image': image})
        return redirect(url_for('add_product'))
    return render_template('add.html', products=products)

if __name__ == '__main__':
    app.run(debug=True)
