package com.json.web.dto;

import java.io.Serializable;

public class RecipeDaqoDTO implements Serializable{

	 /**
	 * 
	 */
	private static final long serialVersionUID = 4227265410817463665L;

	protected String title;

	    /**
	     * 
	     */
	    protected String tags;

	    /**
	     * 
	     */
	    protected String imtro;

	    /**
	     * 
	     */
	    protected String ingredients;

	    /**
	     * 
	     */
	    protected String burden;

	    /**
	     * 
	     */
	    protected String albums;

		@Override
		public String toString() {
			return "RecipeDaqoDTO [title=" + title + ", tags=" + tags + ", imtro=" + imtro + ", ingredients="
					+ ingredients + ", burden=" + burden + ", albums=" + albums + "]";
		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getTags() {
			return tags;
		}

		public void setTags(String tags) {
			this.tags = tags;
		}

		public String getImtro() {
			return imtro;
		}

		public void setImtro(String imtro) {
			this.imtro = imtro;
		}

		public String getIngredients() {
			return ingredients;
		}

		public void setIngredients(String ingredients) {
			this.ingredients = ingredients;
		}

		public String getBurden() {
			return burden;
		}

		public void setBurden(String burden) {
			this.burden = burden;
		}

		public String getAlbums() {
			return albums;
		}

		public void setAlbums(String albums) {
			this.albums = albums;
		}

	
}
