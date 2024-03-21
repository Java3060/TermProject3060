package Util;

public record ApiResponse<T>(boolean success, String message, Object data, Object error) {}


