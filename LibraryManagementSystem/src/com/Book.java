/**
 *
 */
package com;

/**
 * @author 967524
 * mohit
 */
public class Book implements Comparable<Book>{
	private double bookId;
	private String title;
	private String status;
	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	private enum bookType{Fiction, Management, Technical}
	public Book(double bookId, String title, String status) {
		super();
		this.bookId = bookId;
		this.title = title;
		this.status=status;
	}
	public double getBookId() {
		return bookId;
	}
	public void setBookId(double bookId) {
		this.bookId = bookId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	@Override
	public int compareTo(Book arg0) {
		// TODO Auto-generated method stub
		int re=-1;
				if(this.getTitle().equals(arg0.getTitle()))
				{
					re=0;
				}
				else if(this.getTitle().compareTo(arg0.getTitle())==1)
				{
					re=1;
				}
		return re;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(bookId);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (Double.doubleToLongBits(bookId) != Double
				.doubleToLongBits(other.bookId))
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}


}
