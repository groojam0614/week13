/// ***************************************************************************
/// Copyright (c) 2009, Industrial Logic, Inc., All Rights Reserved.
///
/// This code is the exclusive property of Industrial Logic, Inc. It may ONLY be
/// used by students during Industrial Logic's workshops or by individuals
/// who are being coached by Industrial Logic on a project.
///
/// This code may NOT be copied or used for any other purpose without the prior
/// written consent of Industrial Logic, Inc.
/// ****************************************************************************

package com.nts.cleancode.collections;

public abstract class AbstractCollection {
	protected static int INITIAL_CAPACITY = 10;
	protected Object[] elements = new Object[INITIAL_CAPACITY];
	
	public void addAll(AbstractCollection collection) {
		for (int i=0; i < collection.size(); i++) { //3. 이 for 문을 제외하고 다 지우기 4. s>c 5. c > collection
			if (!contains(collection.get(i))) {
				add(collection.get(i)); //1. getElementAt > get (rename)
			}
		}
	}

	public abstract boolean isEmpty();
	public abstract void add(Object element);
	public abstract boolean remove(Object element);
	public abstract boolean contains(Object element);
	public abstract int size();

	public Object get(int index) {
		return elements[index];
	}	
}
