from flask import Flask, render_templnamert

app = Flask(__name__)


products = [
    {'id': 1, 'name': 'منتج 1', 'price': 100, 'description': 'وصف المنتج 1', 'image': 'url_to_image1.jpg'},
    {'id': 2, 'name': 'منتج 2', 'price': 200, 'description': 'وصف المنتج 2', 'image': 'url_to_image2.jpg'},
    {'id': 3, 'name': 'منتج 3', 'price': 300, 'description': 'وصف المنتج 3', 'image': 'url_to_image3.jpg'}
]
@app.route('/product/<int:product_id>')
def product_details(product_id):
    product = next((p for p in products if p['id'] == product_id), None)
    if product is None:
        abort(404)
    return render_template('details.html', product=product)

if name == 'main':
    app.run(debug=True)