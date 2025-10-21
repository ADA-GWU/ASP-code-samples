import threading
import time
import os

def dull_calculation():
    start = time.time()
    while time.time() - start < 30:
        # Some time-consuming useless computation
        x = 0
        for i in range(1000000):
            x += i*i

def main():
    num_cpus = os.cpu_count()  # Number of available CPU cores
    print(f"Detected {num_cpus} CPU cores.")

    threads = []

    for i in range(num_cpus):
        thread = threading.Thread(target=dull_calculation, name=f"Thread-{i+1}")
        threads.append(thread)
        thread.start()
        print(f"Started Thread-{i+1}")

    # Wait for all threads to finish
    for thread in threads:
        thread.join()

    print("All threads have completed.")

if __name__ == "__main__":
    main()

