from re import template
import re
from flask import Flask, render_template

app = Flask(__name__)
@app.route('/')
def home():
    return render_template("index.html")
@app.route('/sum')
def suma():
    return render_template("sum.html")
@app.route('/mult')
def mult():
    return render_template("mult.html")
@app.route('/exp')
def expo():
    return render_template("exp.html")
if __name__ == "__main__":
    app.run(debug=True)
