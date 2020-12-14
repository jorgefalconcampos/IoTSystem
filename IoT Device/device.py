# pip install requests PTable 
import requests, json, datetime, time, sys
from prettytable import PrettyTable

url = "http://localhost:8080/api/devices"

def get_device():
    try:
        response = requests.get(url)
        data = response.text
        devices = json.loads(data)
        if len(devices) < 1:
            print("It seems there are no device(s)")
            sys.exit()
        else:
            x = PrettyTable()         
            for k, v in devices[0].items():             
                x.add_column(k, [v])
            print(x)
            time.sleep(3)  
    except Exception as e:
        print(f"Oh no! An error ocurred: \n{e}")
        sys.exit()

def main():
    while True:
        get_device()

if __name__ == '__main__':
    main()