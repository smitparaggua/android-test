package com.exercise.clickablewidget.colors;

import android.graphics.Color;

public class ColorMixer {
    public static int mixColors(int firstColor, int ... otherColors) {
        int redComponents[];
        int greenComponents[];
        int blueComponents[];

        redComponents = extractColorComponents(
                new ColorComponentExtractor() {
                    @Override
                    public int extractComponent(int color) {
                        return Color.red(color);
                    }
                },
                firstColor, otherColors
        );
        greenComponents = extractColorComponents(
                new ColorComponentExtractor() {
                    @Override
                    public int extractComponent(int color) {
                        return Color.green(color);
                    }
                },
                firstColor, otherColors
        );
        blueComponents = extractColorComponents(
                new ColorComponentExtractor() {
                    @Override
                    public int extractComponent(int color) {
                        return Color.blue(color);
                    }
                },
                firstColor, otherColors
        );
        return combineAllComponents(redComponents, greenComponents, blueComponents);
    }

    private static int[] extractColorComponents(ColorComponentExtractor extractor, int firstColor, int ... colors) {
        int colorComponents[] = new int[colors.length+1];
        colorComponents[0] = extractor.extractComponent(firstColor);
        for(int i = 1; i <= colors.length; ++i) {
            colorComponents[i] = extractor.extractComponent(colors[i]);
        }
        return colorComponents;
    }

    private static int combineAllComponents(int redComponents[], int greenComponents[], int blueComponents[]) {
        int resultingRed = combineSingleComponent(redComponents);
        int resultingGreen = combineSingleComponent(greenComponents);
        int resultingBlue = combineSingleComponent(blueComponents);
        return Color.rgb(resultingRed, resultingGreen, resultingBlue);
    }

    private static int combineSingleComponent(int[] component) {
        int resultingComponent = 0;
        for(int i:component) {
            resultingComponent += i;
        }
        return resultingComponent/component.length;
    }

    private static interface ColorComponentExtractor {
        int extractComponent(int color);
    }
}
