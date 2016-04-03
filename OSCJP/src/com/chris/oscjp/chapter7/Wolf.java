package com.chris.oscjp.chapter7;

class Wolf extends Animal implements Carnivore<Sheep> {
	public void munch(Sheep x) {}
}
