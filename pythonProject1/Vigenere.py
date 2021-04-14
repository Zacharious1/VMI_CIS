#Help Received: https://readthedocs.org/projects/secretpy/downloads/pdf/stable/
from secretpy import Vigenere
plaintext = " Registration is now open for the event, which will be held next Friday " \
            "Register by tomorrow to be entered into a raffle for a gift card prize"
plaintext = plaintext.replace(" ", "")
plaintext = plaintext.replace(",", "")
plaintext = plaintext.lower()

print(Vigenere().encrypt(plaintext, "vmicis"))
