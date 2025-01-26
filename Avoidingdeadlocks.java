import threading

# Shared resources
lock1 = threading.Lock()
lock2 = threading.Lock()

def thread1_task():
    with lock1:
        print("Thread 1 acquired Lock 1")
        with lock2:
            print("Thread 1 acquired Lock 2")
    print("Thread 1 released both locks")

def thread2_task():
    with lock1:  # Locks acquired in the same order
        print("Thread 2 acquired Lock 1")
        with lock2:
            print("Thread 2 acquired Lock 2")
    print("Thread 2 released both locks")

# Create threads
thread1 = threading.Thread(target=thread1_task)
thread2 = threading.Thread(target=thread2_task)

# Start threads
thread1.start()
thread2.start()

# Wait for threads to complete
thread1.join()
thread2.join()
