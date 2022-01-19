package interview.ds;

import java.util.LinkedList;

class Cat extends Animal {
	public Cat(String name) {

		super.name = name;
	}

}

class Dog extends Animal {
	public Dog(String name) {

		super.name = name;
	}

}

public class AnimalShelter {
	LinkedList<Dog> dogs = new LinkedList<>();
	LinkedList<Cat> cats = new LinkedList<>();
	int orderNumber = 0;

	int size() {
		return dogs.size() + cats.size();
	}

	void enQueue(Animal animal) {
		animal.setOrder(orderNumber);
		orderNumber++;
		if (animal instanceof Dog) {
			dogs.add((Dog) animal);
		} else {
			cats.add((Cat) animal);
		}
	}

	Animal deQueue() {
		if (size() > 0) {
			if (dogs.isEmpty()) {
				return cats.poll();
			} else if (cats.isEmpty()) {
				return dogs.poll();
			}

			Animal cat = cats.peek();
			Animal dog = dogs.peek();

			if (cat.getOrder() > dog.getOrder()) {
				return cats.poll();
			} else {
				return dogs.poll();
			}
		} else {

			return null;
		}

	}

	Animal deQueueDog() {
		if (!dogs.isEmpty()) {
			return dogs.poll();
		} else {
			return null;
		}

	}

	Animal deQueueCat() {
		if (!cats.isEmpty()) {
			return cats.poll();
		} else {
			return null;
		}

	}

	public static void main(String[] args) {

		AnimalShelter animalShelter = new AnimalShelter();
		animalShelter.enQueue(new Cat("Cat-1"));
		animalShelter.enQueue(new Cat("Cat-2"));
		animalShelter.enQueue(new Dog("Dog-1"));

		animalShelter.enQueue(new Cat("Cat-3"));
		animalShelter.enQueue(new Dog("Dog-2"));
		animalShelter.enQueue(new Dog("Dog-3"));
		animalShelter.enQueue(new Cat("Cat-4"));
		animalShelter.enQueue(new Dog("Dog-4"));
		animalShelter.enQueue(new Cat("Cat-5"));

		System.out.println(animalShelter.deQueueDog());
		System.out.println(animalShelter.deQueueCat());
		System.out.println(animalShelter.deQueue());
		System.out.println(animalShelter.deQueue());
		System.out.println(animalShelter.deQueue());
		System.out.println(animalShelter.deQueue());


	}

}
