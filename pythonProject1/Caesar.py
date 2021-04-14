#Help Received: https://readthedocs.org/projects/secretpy/downloads/pdf/stable/
from secretpy import Caesar
for i in range(26):
    print(i)
    print(Caesar().decrypt("VRUXKWXYXGLXYNGWTFXGMTEL".lower(), i))
