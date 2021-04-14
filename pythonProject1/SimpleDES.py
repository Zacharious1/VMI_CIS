# HR: Corey Jones and I figured the solution out together

msg = "101011111010"
key = "110011001"

key1 = key[0:8]
key2 = key[1:9]
x = key[0]
key3 = key[2:9]
key3 += x
y = key[0]
y1 = key[1]
key4 = key[3:9]
key4 += y + y1

# sboxes
s1 = [["101", "010", "001", "110", "011", "100", "111", "000"],
      ["001", "100", "110", "010", "000", "111", "101", "011"]]
s2 = [["100", "000", "110", "101", "111", "001", "011", "010"],
      ["101", "011", "000", "111", "110", "010", "001", "100"]]


def expander(r):
    x = r[0]
    x += r[1]
    x += r[3]
    x += r[2]
    x += r[3]
    x += r[2]
    x += r[4]
    x += r[5]
    return x


l1 = msg[0:6]
r1 = msg[6:12]

l2 = r1
r2 = int(expander(r1), 2) ^ int(key1, 2)
r2 = '{0:08b}'.format(r2)

r2l = r2[0:4]
r2r = r2[4:9]

rowR2l = int(r2l[0])
colR2l = int(r2l[1:4], 2)

rowR2r = int(r2r[0])
colR2r = int(r2r[1:4], 2)

s1Out2 = s1[rowR2l][colR2l]
s2Out2 = s2[rowR2r][colR2r]

result2 = s1Out2 + s2Out2
result2 = int(result2, 2) ^ int(l1, 2)

l3 = '{0:06b}'.format(result2)
r3 = int(expander(r2), 2) ^ int(key2, 2)
r3 = '{0:08b}'.format(r3)

r3l = r3[0:4]
r3r = r3[4:9]

rowR3l = int(r3l[0])
colR3l = int(r3l[1:4], 2)

rowR3r = int(r3r[0])
colR3r = int(r3r[1:4], 2)

s1Out3 = s1[rowR3l][colR3l]
s2Out3 = s2[rowR3r][colR3r]

l4 = s1Out3 + s2Out3
r4 = int(expander(r3), 2) ^ int(key3, 2)
r4 = '{0:08b}'.format(r4)

r4l = r4[0:4]
r4r = r4[4:9]

rowR4l = int(r4l[0])
colR4l = int(r4l[1:4], 2)

rowR4r = int(r4r[0])
colR4r = int(r4r[1:4], 2)

s1Out4 = s1[rowR4l][colR4l]
s2Out4 = s2[rowR4r][colR4r]

result4 = s1Out4 + s2Out4

print(l2)
print(l3)
print(l4)
print(result4)
