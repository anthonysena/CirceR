#' @export
printLocales <- function() {
  objRef <- rJava::.jnew("PrintfLocales")
  localeInfo <- objRef$getLocales()
  print(localeInfo$toString())
}
