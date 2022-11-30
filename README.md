# COSC310_Individual_Assignment

The individual assignment is created to show the two new features added to the Inventory System which was done as a group project in the past assignments. New features were added using API libraries found in the internet to improve the usability of the software. The first feature added into the Inventory System is the currency convertor API, and the second feature that was added is the barcode generator API for the materials stored in the inventory. 

# Currency Convertor System
Currency convertor system is implemented to the Inventory System to convert the given monetary value to a desired one depending on the case. "Exchange-Rate API" website was used to get the APIkey and the URL address. After implementing those information into the code, the rest is to arrange the code to make it available for user to use it properly. 

The implemented code runs when a monetary value is given to an material which is stored in the inventory. Then, the code asks a question to view the same amount of the money in five other currencies which are EUR, GBP, TRY, CAD, AUD for now. This number can be incrased if needed in the future, but for now there is only five currencies to keep the code simple. After user chooses the desired currency, the code gets the most up-to-date data from the website about the exchange rate between USD and the desired one. Later on, the exchange rate is multipled with the monetary value given at the beginning of the code. This is how the currency convertor API works in this system. 

# Barcode Generator
Barcode generator system is implemented to the Inventory Sytem to generate a barcode to an material that is being stored in the inventory to organzie, reduce the idle time, and to keep a track of the product flows inside the inventory. "Barbecue" was used as the API library for this feature. After adding classes to the project folder, all is left to do the coding part. 

The implemented code runs when the "barcode generator" feature is chosen, and the program asks two questions to create the barcode. Those questions are asking for which inventory material to create the barcode and what name does the user want to give to the barcode. After specifying those informations, the barcode gets generated and its stored inside the computer as a .jpeg file. Later on, this barcode can be used inside the inventory to keep track of the specific material.
