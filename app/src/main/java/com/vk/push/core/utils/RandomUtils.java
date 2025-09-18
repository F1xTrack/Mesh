package com.vk.push.core.utils;

import java.util.Random;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001J\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/vk/push/core/utils/RandomUtils;", "", "", "nextGaussian", "()D", "core_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class RandomUtils {
    public static final RandomUtils INSTANCE = new RandomUtils();
    public static final Random a = new Random();

    public final double nextGaussian() {
        return a.nextGaussian();
    }
}
