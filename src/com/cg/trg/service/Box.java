package com.cg.trg.service;
/*
 * Java has a root class, Object. All Java classes implicitly
 * extend Object class. This Object class has few methods which are
 * implicitly inherited into all the classes. By overriding these methods,
 * the child classes can acquire the behaviour.
 * 
 * 
 */
public class Box {
	private Double length;
	private Double width;
	private Double depth;
	
	public Box() {
		
	}

	public Box(Double length, Double width, Double depth) {
		super();
		this.length = length;
		this.width = width;
		this.depth = depth;
	}

	//b1.getLength() ; invoking object is b1, within the method, this indicate b1
	//b2.getLength(); invoking object is b2, within the method, this is b2
	public Double getLength() {
		return this.length;
	}

	//b1.setLength(10.7); this.length is same as b1.length
	public void setLength(Double length) {
		this.length = length;
	}

	public Double getWidth() {
		return width;
	}

	public void setWidth(Double width) {
		this.width = width;
	}

	public Double getDepth() {
		return depth;
	}

	public void setDepth(Double depth) {
		this.depth = depth;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((depth == null) ? 0 : depth.hashCode());
		result = prime * result + ((length == null) ? 0 : length.hashCode());
		result = prime * result + ((width == null) ? 0 : width.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Box other = (Box) obj;
		if (depth == null) {
			if (other.depth != null)
				return false;
		} else if (!depth.equals(other.depth))
			return false;
		if (length == null) {
			if (other.length != null)
				return false;
		} else if (!length.equals(other.length))
			return false;
		if (width == null) {
			if (other.width != null)
				return false;
		} else if (!width.equals(other.width))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Box [length=" + length + ", width=" + width + ", depth=" + depth + "]";
	}

	

	
	
	
	
	
	
}
