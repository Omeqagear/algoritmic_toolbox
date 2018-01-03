# Uses python3
import sys

def get_change(value):
    coins  = [10, 5, 1]
    count = 0
    i = 0
    while value > 0:
        count += m / coins[i]
        value %= coins[i]
        i += 1
    return value

if __name__ == '__main__':
    m = int(sys.stdin.read())
    print(get_change(m))
