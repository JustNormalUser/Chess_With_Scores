# Project Can Be Found In "master" Branch
I planned the project with the idea of making playable chess first. I think I made a mistake here and went against the subject in the project. I had a time problem to code the core functions of the project. I coded a chess game where the chess pieces move correctly. However, there was no time left to write the score calculation method. I was planning to do something like:

move():
    for piece in pieceList:
        isThereAnyThreat(piece)

isThereAnyThreat(piece):
    for otherPiece in pieceList:
        if otherPiece.nonequals(piece) && otherPiece.getIsWhite() != piece.getIsWhite():
            if otherPiece.canMove(piece.getX(),piece.getY()):
                piece.setPoint(int(piece.getPoint()/2))
                break;

class Piece:
    canMove(x,y):

However, I got some error there while coding this. At the end, my chess game can be findable at the "master" branch.
