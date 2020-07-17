------------------------------------------------------------------------
This is the project README file. Here, you should describe your project.
Tell the reader (someone who does not know anything about this project)
all he/she needs to know. The comments should usually include at least:
------------------------------------------------------------------------

PROJECT TITLE:Eco System Simulator
PURPOSE OF PROJECT:to create a mini game/simulation of an ecosystem
VERSION or DATE:2/7
AUTHORS:Arnav Choudhury
USER INSTRUCTIONS:
Logic for storing position:
2/7
An two dimensional array of 100 map tiles. Each map tile will hold an array of four rabbit slots. They will movie in or out of this array based on a move method which will pick a direction from 
1-4. The tile array will be initialized in the main method.

How to move the rabbit every turn:
Generate a random direction 1-4:1and3 will change the column tile number:2-4 will change the row tile number.
For now the movement, the rabbit will just be removed from one array and added to the other.

