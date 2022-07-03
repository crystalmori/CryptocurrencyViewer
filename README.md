# CryptocurrencyViewer
Using the MVC pattern submit a Cryptocurrency viewer. UCLA Java II
Using the MVC pattern submit a Cryptocurrency viewer.
The source of the data should be using the endpoints under HistoMinute, HistoHour and HistoDay from cryptocompare
Minute: https://min-api.cryptocompare.com/data/histominute?aggregate=1&e=CCCAGG&extraParams=CryptoCompare&fsym=BTC&limit=10&tryConversion=false&tsym=USD
Hour: https://min-api.cryptocompare.com/data/histohour?aggregate=1&e=CCCAGG&extraParams=CryptoCompare&fsym=BTC&limit=10&tryConversion=false&tsym=USD
Day: https://min-api.cryptocompare.com/data/histoday?aggregate=1&e=CCCAGG&extraParams=CryptoCompare&fsym=BTC&limit=10&tryConversion=false&tsym=USD
 
The UI should look like the following (minus the purple lines):
![image](https://user-images.githubusercontent.com/56135820/177054940-8bedce79-d0cd-4357-8b95-83d344b65047.png)

  
The items between two of the dotted black vertical lines represents a sample. On Purple we are highlighting the high, low point, the opening and closing points.
These endpoints should be changed when the respective button is pressed and display the right values
The points that make up the full amount of points is:
1.	UI displays all the elements shown in the prototype
2.	Switching endpoints when displaying the correct button
3.	Usage of data structures and asynchronous calls
4.	Using correctly the MVC pattern
5.	Works correctly
