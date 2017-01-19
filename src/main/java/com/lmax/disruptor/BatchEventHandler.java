package com.lmax.disruptor;

public interface BatchEventHandler<T> extends EventHandler<T>
{
    int getBatchSize();
}
