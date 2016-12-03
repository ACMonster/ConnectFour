'''
Maintain the state of the game:
	add pieces to the board
	check whether the game has ended and decides the winner
'''

class GameState:

	def __init__(self, height = 6, width = 7):
		self.width = width
		self.height = height
		self.board = [[0] * width for i in range(height)]

	''' 
	add a piece for player id (+1 or -1) at column col
	return true for a success move
	'''

	def addPiece(self, id, col):
		if board[0][col] != 0:
			return false
		pos = 0
		while pos < height and board[pos][col] == 0:
			pos += 1
		board[pos - 1][col] = id
		return true

	'''
	return the id (+1 or -1) of the winner (0 in case of a draw)
	or 2 if the game has not ended
	'''
	def winner(self):
		for i in range(self.height):
			for j in range(self.width):
				#check whether some player wins
				pass

		# the board is not full, return 2
		for i in range(self.width):
			if self.board[0][i] != 0:
				return 2

		# the game ends with a draw
		return 0
