# Water Billing System

This is the final project for the subject **Object-Oriented Programming (OOP) with Graphical User Interface (GUI)**. The system was developed using Java, specifically Java Swing, as part of the course requirements.

This is a group project developed in collaboration with other members. Credits are given to everyone who contributed to the frontend development and the formation of the program's logic.

<br>

## Features and How It Works

For simplicity, this project currently contains only two views, which can be accessed through the menu in the upper-left corner: **Add Customer** and **Customer Summary**.

Admittedly, this may seem lacking for a complete billing system, especially with the absence of edit and delete functionalities. I plan to remake and improve this project in the near future by implementing the aforementioned features, along with Java Database Connectivity (JDBC). ;)

### 1. Add Customer

Upon running the program, the user is greeted with the **Add Customer** view. Here, they can fill in the required customer information and water consumption details.

Once the **COMPUTE** button is clicked, the program automatically calculates the water bill and displays the breakdown of the computation in the designated text fields on the lower half of the GUI.

### 2. Save Customer

After completing the computation, the user can click the **SAVE CUSTOMER** button to save the customer's information.

The program stores the information in an `ArrayList`. Additionally, the saved information is printed in the console using `System.out.println()` to verify that the data has been successfully stored.

### 3. Customer Summary

To view the saved customer information, the user must navigate to the **Customer Summary** view through the menu.

The information previously saved in the `ArrayList` is then displayed in a table.

### 4. Navigation

The user can switch between the two views using the menu located in the upper-left corner of the program. This allows them to return to the **Add Customer** view or access the **Customer Summary** whenever needed.

<br>

## Technologies Used

- **Java** – Primary programming language
- **Java Swing** – Graphical User Interface (GUI)
- **ArrayList** – Temporary storage of customer information
- **System.out.println()** – Console output for verification

<br>

## Future Improvements

- Add customer information editing functionality.
- Add customer deletion functionality.
- Implement JDBC for database connectivity.
- Improve the overall system and introduce additional features.

<br>

## Credits

Developed as a group project for the subject Object-Oriented Programming with Graphical User Interface.

Special thanks to my fellow group members for their contributions to the frontend development and program logic.