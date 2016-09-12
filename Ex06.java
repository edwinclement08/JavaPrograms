/* Name: Edwin Clement
 * Roll No.: 7624
 * Aim:  Matrix Class*/


import java.io.*;
import java.util.*;

class Matrix    {
    int arr[][];

    Matrix(int r, int c)    {
        arr = new int[r][c];
    }

    void readMatrix()   {
        System.out.println("Enter the elements of the array, row-wise:");
        Scanner sc = new Scanner(System.in);
        for(int i = 0 ; i < arr.length; i++)    {
            for(int j = 0 ; j < arr[0].length; j++)    {
                arr[i][j] = sc.nextInt();
            }
        }
    }


    void display() {
        System.out.println("Contents of the Matrix");
        for(int i =0; i < arr.length; i++)  {
            for(int j = 0; j < arr[i].length; j++)  {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    void setVal(int i, int j, int val)  {
        arr[i][j] = val;
    }


    void printTranspose()   {
        Matrix mat2 = getTranspose();
        mat2.display();
    }

    Matrix getTranspose()   {
        Matrix mat2 = new Matrix(arr[0].length, arr.length);
        for(int j = 0; j < arr[0].length; j++)  {
            for(int i = 0; i < arr.length; i++)  {
                mat2.setVal(j, i, arr[i][j]);
            }
        }
        return mat2;
    }

    boolean isSymmetric()   {
        Matrix mat2 = getTranspose();
        for(int i = 0; i < arr.length; i++)  {
            for(int j = 0; j < arr[0].length; j++)  {
                if(this.arr[i][j] != mat2.arr[i][j])    
                    return false;
            }
        }
        return true;
    }

    Matrix multiplyMat(Matrix mat2) {
        if(this.arr[0].length == mat2.arr.length)       {
            Matrix c = new Matrix(this.arr.length, mat2.arr[0].length);
            for(int i = 0; i < this.arr.length; i++)    {
                for(int j = 0; j < mat2.arr[0].length; j++) {
                    int sum = 0;
                    for(int k = 0; k < mat2.arr.length; k++)    {
                       sum += this.arr[i][k]* mat2.arr[j][i];
                    }
                    c.arr[i][j] = sum;
                }
            }
            return c;
        }   else    {
            System.out.println("The Matrixes can't be multiplied");
            return mat2;
        }
    }
}

class Ex6   {
    public static void main(String args[])   {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and column of Matrix 1:");

        Matrix mat = new Matrix(sc.nextInt(), sc.nextInt());
        mat.readMatrix();

        mat.display();
        mat.printTranspose();
        System.out.println("It is " + mat.isSymmetric() + " that it is Symmetric");
        System.out.println("Enter the number of rows and column of Matrix 2:");
        Matrix mat2 = new Matrix(sc.nextInt(), sc.nextInt());
        mat2.readMatrix();
        mat.multiplyMat(mat2).display();
    }
}



/* Output --
Enter the number of rows and column of Matrix 1:
2 2 
Enter the elements of the array, row-wise:
1 2 3 4
Contents of the Matrix
1 2 
3 4 
Contents of the Matrix
1 3 
2 4 
It is false that it is Symmetric
Enter the number of rows and column of Matrix 2:
2 2
Enter the elements of the array, row-wise:
1 2 3 4
Contents of the Matrix
3 9 
14 28 
*/
