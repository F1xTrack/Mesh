package com.vk.push.core.remote.config.omicron.retriever;

import com.vk.push.core.remote.config.omicron.Data;
import com.vk.push.core.remote.config.omicron.ParseException;

/* loaded from: classes2.dex */
public interface ResponseParser {
    Data parse(String str) throws ParseException;
}
