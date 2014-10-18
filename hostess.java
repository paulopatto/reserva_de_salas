class Hostess extends Person {

  private IBook book;

  public Hostess(IBook book){
    this.book = book;
  }

  public void bookRoom(int room_id){
    book.bookRoom(room_id);
  }

  public cancelBook(int schedule_id){
    ///
  }

  public verify(int room_id){
    /// code
  }

  public pay(){}
}
