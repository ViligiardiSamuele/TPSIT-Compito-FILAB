## VERIFICA THREAD FILA B


Un gruppo di 10 bevitori ha a disposizione una botte di vino con 3 rubinetti, contenente 100 litri di vino. 

Di conseguenza possono bere solo tre persone alla volta, sempre che la botte contenga ancora vino. 

Si suppone per semplicità che ogni bevuta faccia diminuire il vino nella botte di una quantità variabile intera compresa fra 1 litro e 3 litri.

Simulare la suddetta situazione in Java, utilizzando un Monitor cioè uno o più  metodi Java con il costrutto synchronized. 

Il thread bevitore, mediante una iterazione, dopo aver atteso un tempo casuale, deciderà di bere: il thread rimane in attesa se il numero di rubinetti liberi è 0, altrimenti effettuerà la bevuta (se c’è ancora vino nella botte) in un tempo variabile tra i 2 e 3 secondi, quindi rilascerà il rubinetto.
Qualora non ci sia più vino nella botte, i thread in attesa devono essere terminati.

Nel metodi del Monitor gestire i vincoli sulla mutua esclusione e sugli accessi limitati.

Inserire nei punti opportuni del programma delle stampe per mostrare all’utente l’evoluzione dello stato dei bevitori e della botte. 

Salvare in piattaforma CLASSROOM la cartella zippata _<cognome_FILA_X>_ contenente l’intero progetto JAVA

Una valutazione più alta sarà data a chi in piattaforma CLASSROOM consegnerà un link GIT-HUB al repository contenente l’intero progetto java
