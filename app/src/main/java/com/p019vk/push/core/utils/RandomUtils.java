package com.p019vk.push.core.utils;

import java.util.Random;
import kotlin.Metadata;

@Metadata(m22266d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001J\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m22267d2 = {"Lcom/vk/push/core/utils/RandomUtils;", "", "", "nextGaussian", "()D", "core_release"}, m22268k = 1, m22269mv = {1, 7, 1}, m22271xi = 48)
/* loaded from: classes2.dex */
public final class RandomUtils {
    public static final RandomUtils INSTANCE = new RandomUtils();

    /* renamed from: a */
    public static final Random f20601a = new Random();

    public final double nextGaussian() {
        return f20601a.nextGaussian();
    }
}
