package it.software.engineer.bugs.apirestbug.utils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MemoryStats {

    private long heapSize;

    private long heapMaxSize;

    private long heapFreeSize;
}
