import kotlinx.coroutines.delay


// Sealed classes restrict class hierarchies.
// All subclasses must be defined in the same file


sealed class ScreenUiState {

    object Loading: ScreenUiState()
    data class Success(var data: SomeData): ScreenUiState()
    data class Error(var errorMessage: String): ScreenUiState()

}

data class SomeData(
    val name: String
)

fun main() {


    updateUI(screenUiState = ScreenUiState.Loading)
    ///some delay
    Thread.sleep(1000)
    updateUI(screenUiState = ScreenUiState.Success(SomeData("Test")))


}

fun updateUI(screenUiState: ScreenUiState) {
    when(screenUiState) {
        is ScreenUiState.Loading -> {
            println("loading")
        }
        is ScreenUiState.Success -> {
            println(screenUiState.data)
        }
        is ScreenUiState.Error -> {
            println(screenUiState.errorMessage)
        }
    }
}


