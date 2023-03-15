from flask import Flask
import time

app = Flask(__name__)

@app.route('/api/hello', methods=['GET'])
def get_hello():
    time.sleep(1)
    return "Hello world"

@app.route('/api/fast-hello', methods=['GET'])
def get_fast_hello():
    return "Hello world"

if __name__ == '__main__':
    app.run()