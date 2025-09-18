package io.sentry;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.OutputStream;
import java.io.Reader;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public interface S {
    String a(ConcurrentHashMap concurrentHashMap);

    Object b(Reader reader, Class cls);

    io.sentry.internal.debugmeta.c c(BufferedInputStream bufferedInputStream);

    Object d(BufferedReader bufferedReader, Class cls, C5119e c5119e);

    void e(Object obj, BufferedWriter bufferedWriter);

    void f(io.sentry.internal.debugmeta.c cVar, OutputStream outputStream);
}
