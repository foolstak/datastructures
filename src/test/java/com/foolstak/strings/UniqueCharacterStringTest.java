package com.foolstak.strings;

import org.junit.Test;

import static org.junit.Assert.*;

public class UniqueCharacterStringTest {

    @Test
    public void testThatTrueIsReturnedForUniqueStrings(){
        assertTrue(UniqueCharacterString.isUniqueWithSeparateDatastructure("abcdefg"));

    }

    @Test
    public void testThatFalseIsReturnedForNonUniqueStrings(){
        assertFalse(UniqueCharacterString.isUniqueWithSeparateDatastructure("abcaadefgh"));
    }

}