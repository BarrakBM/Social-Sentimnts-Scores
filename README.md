# Social-Sentimnts-Scores
*******************************************************
*  **Name      :**  Barrak Mandani     
*  **Student ID:**  110031165
*  **Class     :**  CSCI 3415           
*  **HW#       :**  3        
*  **Due Date  :**  1/7/2023
*******************************************************
   


##  Social sentiment calculator ##



* This porgram act as both server and client by using the ``select()`` it will append The server reads a configuration file called config.txt, which contains the IP address, port number, and location of multiple partners. Then the user will define a grid size (rows and columns) The server then binds to the specified port and listens for incoming messages from any of the partners. When a message is received, it will check the port number and the version. If the version or the it will not display the message ( will be ignored and printing the error type depends if it is the port or version) if it's destined to both of the ``portNumber`` and ``version`` the program will start displaying the message also it will append the location of the reciever ``my location`` after getting the location both location the program will start to calculate ``x`` and ``y`` coordinates. If the message recieved was more than 2 squares away by using the Euclidean formula the program will print ``out of range`` and print all data. If it is less than 2 squares away it will print ``in range``. If it's outside the grid it will print ``Not in Grid``
 to the message as it will show sender and reciever locations. The addition to this program it will check for for fromPort, toPort and ttl. If the toPort is not your    port check for ttl and location, if distance les than 2 squares away and ttl > 0 forward the message if not discard it. If toPort is your port check distance and ttl if distance is less than 2 squares away and and TTL > 0 print the message other wise discard it

 ## Run The Code
 # python #
 To run this code type in the terminal (for example depend on where's the file)
  * python -u "CU denver\CU\Summer 23\Princepl of programming languages\HW3\Social-Sentimnts-Scores\Social_p.py"                                                                
  * Enter the review file nme
 # java#
  * cd "c:\CU denver\CU\Summer 23\Princepl of programming languages\HW3\Social-Sentimnts-Scores\" ; if ($?) { javac Main.java } ; if ($?) { java Main }
  * Enter the review file name


##  Circumstances of programs

   * The program runs successfully.  
   * The program was developed on VsCode and different cases have been tried.
          