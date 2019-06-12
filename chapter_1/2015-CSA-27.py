data = [6, 3, 2, 5, 4, 1]
j = 0
for each in range(len(data) - 1):
    m = j
    k  = j+1
    while k < len(data):
        if data[k] < data[m]:
            m = k
        k+=1
    temp = data[m]
    data[m] = data[j]
    data[j] = temp
    print(data)
    
        