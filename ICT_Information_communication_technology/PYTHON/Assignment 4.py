
balance = 1000.0
    
while True:
        print("\n1. Deposit | 2. Withdraw | 3. Balance | 4. Exit")
        choice = input("Enter your choice: ")
        
     if choice == '4':
            break
        elif choice == '3':
            print(f"Current Balance: Rs. {balance}")
        elif choice in ['1', '2']:
            try:
                amount = float(input("Enter amount: "))
                if amount <= 0:
                    print("Invalid amount. Enter a positive number.")
                elif choice == '1':
                    balance += amount
                    print(f"Deposited. New Balance: Rs. {balance}")
                elif choice == '2' and amount <= balance:
                    balance -= amount
                    print(f"Withdrawn. New Balance: Rs. {balance}")
                elif choice == '2':
                    print("Insufficient balance.")
            except ValueError:
                print("Invalid input. Please enter numbers only.")
        else:
            print("Invalid choice. Select from 1 to 4.")


