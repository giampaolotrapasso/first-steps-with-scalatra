package it.cosenonjaviste.restapp

/**
  * Created by giampaolo on 30/11/15.
  */
case class User(id: Int, name: String)

object User {

  var users: Map[Int, User] = List[User](
    User(0, "Solid Snake"),
    User(1, "Vulcan Raven"),
    User(2, "Meryl Silverburgh"),
    User(3, "Hal Emmerich"),
    User(4, "Frank Jaeger")
  ).map(user => user.id -> user).toMap

  def getAll: Iterable[User] = users.values

  def get(i: Int): Option[User] = users.get(i)

  def store(user: User) = {
    users += user.id -> user
  }

  def delete(user: User) = {
    users -= user.id
  }
}
