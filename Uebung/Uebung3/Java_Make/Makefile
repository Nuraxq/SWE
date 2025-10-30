BIN_DIR = bin
JC = javac
SRC = src/A.java src/B.java src/Main.java
JAVA = java
CLASSES = bin/A.class bin/B.class bin/Main.class

#Wir geben die Version aus und lassen dann das Programm laufen. 
all: version run

run:$(BIN_DIR) $(CLASSES)
#Wir führen es aus, testen Vorher ob alles kompiliert ist
	$(JAVA) -cp $(BIN_DIR) Main

clean: 
# Verzeichnis Löschen, /S löscht untervezeichnisse /Q sorgt dafür dass nicht bestätigt werden muss
	rmdir /S /Q $(BIN_DIR)


#Die Klassen werden neu Kompiliert falls sich was geändert hat
$(CLASSES):
	$(JC) -d $(BIN_DIR) $(SRC)

#Falls das Verzeichnis nicht da ist machen wir es neu
$(BIN_DIR):
	mkdir $(BIN_DIR)


version: 
	@echo "Aktuelle Java Version: " 
	$(JAVA) --version