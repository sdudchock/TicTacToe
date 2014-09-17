package TicTacToe;

Start New Game
    Start Application   TicTacToe
    Select Window       Tic Tac Toe

Mark Location   [Arguments]     ${row}      ${col}
    ${component}=   Catenate    SEPARATOR=  Location    ${row}  ${col}
    Click On Component  ${component}

Check Location  [Arguments]     ${row}  ${col}  ${mark}
    ${component}=   Catenate    SEPARATOR=  Location    ${row}  ${col}
    Label Text Should Be    ${component}    ${mark}
    
Winner Should Be    [Arguments]     ${winner}
    Select Dialog   Game Over
    ${message}=     Catenate    The winner is   ${winner}
    Label Text Should Be    OptionPane.label    ${message}
    Close Dialog    Game Over
    Close Window    Tic Tac Toe