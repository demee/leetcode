package org.demee.minimumTimeToVisitAllPoints;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MinimumTimeSolution {
    public static void main(String[] args) {
        int[][] points = {{1,1},{3,4},{-1,0}};
        System.out.println(new MinimumTimeSolution().steppingMinTimeToVisitAllPoints(points));
        
    }

    public int steppingMinTimeToVisitAllPoints(int[][] points){
        int time = 0;
        // find the neerest point to current point
        
        for (int i = 0; i < points.length - 1; i++) {
            int[] currentPos = points[i];
            while(currentPos[0] != points[i+1][0] || currentPos[1] != points[i+1][1]) {
                System.out.println(currentPos[0] + " " + currentPos[1]);
                int dist = 0;
                if (points[i][0] < points[i+1][0]) {
                    dist++;
                    currentPos[0] = points[i][0] + 1;
                } else if(points[i][0] > points[i+1][0]) {
                    dist++;
                    currentPos[0] = points[i][0] - 1;
                }

                if (points[i][1] < points[i+1][1]) {
                    dist++;
                    currentPos[1] = points[i][1] + 1;
                } else if(points[i][1] > points[i+1][1]) {
                    dist++;
                    currentPos[1] = points[i][1] - 1;
                }

                if (dist == 2 || dist == 1) {
                    time += 1;
                }                
            }
        }

        return time;
    }



    public int minTimeToVisitAllPoints(int[][] points) {
        List<int[]> temp = Arrays.asList(points);
        int bestSolution = Integer.MAX_VALUE;
        // shuffle the array
        int i = 0;
        while(i < 100) {
            Collections.shuffle(temp);
            i++;
            int distance = calculateDistance(temp);
            if(distance < bestSolution) {
                bestSolution = distance;
            }
        }

        return bestSolution;
    }

    public int calculateDistance(List<int[]> points) {
        // calculate the distance
        double distance = 0;
        for (int i = 0; i < points.size() - 1; i++) {
            int[] point1 = points.get(i);
            int[] point2 = points.get(i + 1);
            distance += Math.sqrt(Math.pow(point2[0] - point1[0], 2) + Math.pow(point2[1] - point1[1], 2));;
        }
        return (int) distance;
    }
}
