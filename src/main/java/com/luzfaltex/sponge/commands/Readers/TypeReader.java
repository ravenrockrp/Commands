package com.luzfaltex.sponge.commands.Readers;

/**
 * Defines a reader class that parses user input in to a specified type
 */
public abstract class TypeReader {

    /**
     * Attempts to parse the input into the desired type
     * @param context The context of the command
     * @param input The raw input of the command
     * @return A CompletableFuture that represents the async parsing operation. The task result contains the parsing result.
     */
    public abstract CompletableFuture<TypeReaderResult> ReadAsync(ICommandContext context, String input)
}
