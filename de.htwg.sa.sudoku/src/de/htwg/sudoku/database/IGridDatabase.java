package de.htwg.sudoku.database;

import java.util.List;

import de.htwg.sudoku.model.IGrid;

public interface IGridDatabase {
	
	void saveGrid(IGrid grid);
	
	boolean containsGridByName(String name);
	
	List<IGrid> getGridsByDifficulty(int max, int min);
	
	IGrid getGrid(String name, int setCells);
	
	void deleteGrid(IGrid grid);
	
	List<IGrid> getAllGrids();
	
	void generateGrids(int number, int gridSize);
}