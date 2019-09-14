class Singleton(object):
    mens = None
    texto = ""

    def getMensaje(cls):
        if not cls.mens:
            cls.mens = Singleton()
        return cls.mens
    def imprimirTexto(self):
        print("El mensaje es: ",self.texto )

    def setTexto(self, texto):
        self.texto = texto


ms = Singleton()
ms_2 = Singleton()
ms.getMensaje()
ms_2.getMensaje()
ms.setTexto("Hola a todos")
ms_2.imprimirTexto()

