package hashtable;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Objects;

/**
 * This is a Hashtable. It is used for key value based concept also called as
 * dictionary in other languages.
 * 
 * @author Shiva
 *
 * @param <K>
 * @param <V>
 */
public class Hashtable<K, V> {

	private LinkedList<Node<K, V>>[] hashtable;

	/**
	 * 
	 * @author Shiva
	 * @param capacity
	 */
	@SuppressWarnings("unchecked")
	public Hashtable(int capacity) {
		this.hashtable = new LinkedList[capacity];
		for (int i = 0; i < hashtable.length; i++) {
			hashtable[i] = new LinkedList<>();

		}
	}

	/**
	 * If the key is present then gets the value for the specified key. if key is
	 * not present null value is returned.
	 * 
	 * @author Shiva
	 * @param key
	 * @return value
	 */
	public V get(Object key) {
		ListIterator<Node<K, V>> list = hashtable[hashkey(key)].listIterator();
		while (list.hasNext()) {
			Node<K, V> obj = list.next();
			if (obj.key.equals(key)) {
				return obj.value;
			}
		}
		return null;
	}

	/**
	 * Puts in the form of (key,value) pair object in the hashtable. If the specific
	 * key is already present, it returns the old value and updates the newer value.
	 * If key is null, throws {@link NullPointerException}
	 * 
	 * @author Shiva
	 * @param key
	 * @param value
	 * @return value
	 * @return {@link NullPointerException}
	 */
	public V put(K key, V value) {
		int hash = hashkey(key);
		Node<K, V> node = new Node<>(hash, key, value);
		Node<K, V> getValue = get(node);
		if (getValue == null)
			hashtable[hashkey(key)].add(node);
		return Objects.isNull(getValue) ? value : getValue.value;
	}

	/**
	 * Private method to fetch the data before put.
	 * 
	 * @author Shiva
	 * @param node
	 * @return
	 */
	private Node<K, V> get(Node<K, V> node) {
		ListIterator<Node<K, V>> list = hashtable[hashkey(node.key)].listIterator();
		while (list.hasNext()) {
			Node<K, V> obj = list.next();
			if (node.value.equals(obj.value) && node.key.equals(obj.key))
				return node;
		}
		return null;
	}

	/**
	 * Hashing for key.
	 * 
	 * @author Shiva
	 * @param key
	 * @return
	 */
	public int hashkey(Object key) {
		return Math.abs(key.hashCode()) % hashtable.length;
	}

	/**
	 * To print the whole buckets with their linked lists
	 * 
	 * @author Shiva
	 */
	public void printHashtable() {
		ListIterator<Node<K, V>> list = null;
		for (int i = 0; i < hashtable.length; i++) {

			list = hashtable[i].listIterator();
			System.out.print("bucket[" + i + "] ->");
			while (list.hasNext())
				System.out.print(" " + list.next() + " ->");
			System.out.println();
		}
	}

	/**
	 * Removes the object from the map for the specified key.
	 * 
	 * @author Shiva
	 * @param key
	 * @return value
	 */
	public V remove(Object key) {

		ListIterator<Node<K, V>> list = hashtable[hashkey(key)].listIterator();
		Node<K, V> obj = null;
		while (list.hasNext()) {
			obj = list.next();
			if (obj.key.equals(key)) {
				list.remove();
				break;
			}
		}
		return obj.key.equals(key) ? obj.value : null;

	}

	/**
	 * Removes the object from the map for the specified key and the value.
	 * 
	 * @author Shiva
	 * @param key
	 * @return value
	 */
	public V remove(Object key, Object value) {
		ListIterator<Node<K, V>> list = hashtable[hashkey(key)].listIterator();
		Node<K, V> obj = null;

		while (list.hasNext()) {
			obj = list.next();
			if (obj.key.equals(key) && obj.value.equals(value)) {
				list.remove();
				break;
			}
		}
		return obj.key.equals(key) ? obj.value : null;
	}
}

class Node<K, V> {
	Node<K, V> next;
	K key;
	V value;
	int hash;

	public Node(int hash, K key, V value) {
		this.hash = hash;
		this.key = key;
		this.value = value;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((key == null) ? 0 : key.hashCode());
		result = prime * result + ((value == null) ? 0 : value.hashCode());
		return result;
	}

	@Override
	@SuppressWarnings("unchecked")
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Node<K, V> other = (Node<K, V>) obj;
		if (key == null) {
			if (other.key != null)
				return false;
		} else if (!key.equals(other.key))
			return false;
		if (value == null) {
			if (other.value != null)
				return false;
		} else if (!value.equals(other.value))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Node [key=" + key + ", value=" + value + ", hash=" + hash + "]";
	}

}
