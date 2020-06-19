Coding Steps:

1.	Create an instance of an ArrayList of String called employeeNames
2.	Create an instance of a HashSet of Integer called ids
3.	Create an instance of a HashMap of Integer, String called employeeMap
4.	Add at least five entries to the employeeNames and ids (make sure both collections have the same number of entries).
5.	Create a variable int i = 0; then iterate over ids using an enhanced for loop. Inside the enhanced for loop use employeeMap.put() to add a new entry to the map. The entry should consist of a key that is the id in the enhanced loop’s current iteration, and a value that is the employeeName at position i of the employeeNames ArrayList. Increment i so  that each iteration grabs the next element in the ArrayList.
6.	Once the employeeMap is fully populated, use another enhanced for loop to iterate over the employeeMap.keySet(), and use the key for each current iteration to print to the console both the current key and its associated value in the map.
7.	Create a StringBuilder called idsBuilder.
8.	Iterate over the ids HashSet and append each id, followed by a dash “-“ to idsBuilder.
9.	Print the result of idsBuilder.toString() to the console.
10.	Create another StringBuilder called namesBuilder.
11.	Iterate over the employeeNames ArrayList and append each name, followed by a space “ “ to the namesBuilder.
12.	Print the result of namesBuilder.toString() to the console.
