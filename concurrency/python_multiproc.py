import multiprocessing
import time

def dull_calculation():
    start = time.time()
    while time.time() - start < 30:
        x = 0
        for i in range(1000000):
            x += i*i

def main():
    num_cpus = multiprocessing.cpu_count()
    print(f"Detected {num_cpus} CPU cores.")

    processes = []

    for i in range(num_cpus):
        process = multiprocessing.Process(target=dull_calculation, name=f"Process-{i+1}")
        processes.append(process)
        process.start()
        print(f"Started Process-{i+1}")

    for process in processes:
        process.join()

    print("All processes have completed.")

if __name__ == "__main__":
    main()

