// Copyright (C) 2016  Maxim Bublis
//
// This program is free software: you can redistribute it and/or modify
// it under the terms of the GNU General Public License as published by
// the Free Software Foundation, either version 3 of the License, or
// (at your option) any later version.
//
// This program is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
// GNU General Public License for more details.
//
// You should have received a copy of the GNU General Public License
// along with this program.  If not, see <http://www.gnu.org/licenses/>.

import edu.princeton.cs.algs4.StdOut;

public class Ex_1_1_20
{
    private static double logFact(int N)
    {
        if (N == 1) return 0.0;

        return Math.log(N) + logFact(N - 1);
    }

    public static void main(String[] args)
    {
        int N1 = 7, N2 = 15;

        StdOut.printf("ln(%d!) = %f\n", N1, logFact(N1));
        StdOut.printf("ln(%d!) = %f\n", N2, logFact(N2));
    }
}
