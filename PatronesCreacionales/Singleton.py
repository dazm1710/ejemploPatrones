class SoyUnico():

    __instance = None
    nombre = None

    def __str__(self):
        return self.nombre

    def __new__(cls):
        if SoyUnico.__instance is None:
            SoyUnico.__instance = object.__new__(cls)
        return SoyUnico.__instance

user1 = SoyUnico()
user1.nombre = "Francisco Caldas"
print(user1)
user2 = SoyUnico()
user2.nombre = "Juan Valdez"
print(user2)

print(user1)
print(user2)
user3 = SoyUnico()
user3.nombre = "Alfonso Medina"

print (user1)
print (user2)
print (user3)
