package com.app.network.models.responseModels;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000=\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0003\b\u0095\u0001\b\u0087\b\u0018\u00002\u00020\u0001B\u00f5\u0003\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u000f\u001a\u00020\t\u0012\u0006\u0010\u0010\u001a\u00020\t\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0001\u0012\u0006\u0010\u0013\u001a\u00020\t\u0012\u0006\u0010\u0014\u001a\u00020\t\u0012\u0006\u0010\u0015\u001a\u00020\t\u0012\u0006\u0010\u0016\u001a\u00020\t\u0012\u0006\u0010\u0017\u001a\u00020\t\u0012\u0006\u0010\u0018\u001a\u00020\t\u0012\u0006\u0010\u0019\u001a\u00020\t\u0012\u0006\u0010\u001a\u001a\u00020\u0001\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0007\u0012\u0006\u0010\u001d\u001a\u00020\t\u0012\u0006\u0010\u001e\u001a\u00020\t\u0012\u0006\u0010\u001f\u001a\u00020\t\u0012\u0006\u0010 \u001a\u00020\t\u0012\u0006\u0010!\u001a\u00020\t\u0012\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\u0007\u0012\u0006\u0010$\u001a\u00020\t\u0012\u0006\u0010%\u001a\u00020\t\u0012\u0006\u0010&\u001a\u00020\t\u0012\u0006\u0010\'\u001a\u00020\u0001\u0012\u0006\u0010(\u001a\u00020\u0001\u0012\u0006\u0010)\u001a\u00020\u0005\u0012\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007\u0012\u0006\u0010+\u001a\u00020\u0005\u0012\u0006\u0010,\u001a\u00020\t\u0012\u0006\u0010-\u001a\u00020\u0001\u0012\u0006\u0010.\u001a\u00020\t\u0012\u0006\u0010/\u001a\u00020\t\u0012\u0006\u00100\u001a\u000201\u0012\u0006\u00102\u001a\u00020\u0005\u0012\u0006\u00103\u001a\u00020\u0001\u0012\u0006\u00104\u001a\u00020\t\u0012\u0006\u00105\u001a\u00020\u0001\u0012\u0006\u00106\u001a\u00020\t\u0012\u0006\u00107\u001a\u00020\t\u0012\u0006\u00108\u001a\u00020\u0001\u0012\u0006\u00109\u001a\u00020\u0001\u0012\u0006\u0010:\u001a\u00020\u0005\u0012\u0006\u0010;\u001a\u00020\u0005\u0012\u0006\u0010<\u001a\u00020\u0003\u0012\u0006\u0010=\u001a\u00020\t\u0012\u0006\u0010>\u001a\u00020\t\u0012\u0006\u0010?\u001a\u00020\t\u0012\u0006\u0010@\u001a\u00020\u0001\u0012\u0006\u0010A\u001a\u00020\t\u0012\u0006\u0010B\u001a\u00020\u0001\u0012\u0006\u0010C\u001a\u00020\u0001\u00a2\u0006\u0002\u0010DJ\n\u0010\u0086\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u0087\u0001\u001a\u00020\tH\u00c6\u0003J\n\u0010\u0088\u0001\u001a\u00020\tH\u00c6\u0003J\n\u0010\u0089\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u008a\u0001\u001a\u00020\u0001H\u00c6\u0003J\n\u0010\u008b\u0001\u001a\u00020\tH\u00c6\u0003J\n\u0010\u008c\u0001\u001a\u00020\tH\u00c6\u0003J\n\u0010\u008d\u0001\u001a\u00020\tH\u00c6\u0003J\n\u0010\u008e\u0001\u001a\u00020\tH\u00c6\u0003J\n\u0010\u008f\u0001\u001a\u00020\tH\u00c6\u0003J\n\u0010\u0090\u0001\u001a\u00020\tH\u00c6\u0003J\n\u0010\u0091\u0001\u001a\u00020\u0005H\u00c6\u0003J\n\u0010\u0092\u0001\u001a\u00020\tH\u00c6\u0003J\n\u0010\u0093\u0001\u001a\u00020\u0001H\u00c6\u0003J\u0010\u0010\u0094\u0001\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0007H\u00c6\u0003J\n\u0010\u0095\u0001\u001a\u00020\tH\u00c6\u0003J\n\u0010\u0096\u0001\u001a\u00020\tH\u00c6\u0003J\n\u0010\u0097\u0001\u001a\u00020\tH\u00c6\u0003J\n\u0010\u0098\u0001\u001a\u00020\tH\u00c6\u0003J\n\u0010\u0099\u0001\u001a\u00020\tH\u00c6\u0003J\u0010\u0010\u009a\u0001\u001a\b\u0012\u0004\u0012\u00020#0\u0007H\u00c6\u0003J\n\u0010\u009b\u0001\u001a\u00020\tH\u00c6\u0003J\u0010\u0010\u009c\u0001\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007H\u00c6\u0003J\n\u0010\u009d\u0001\u001a\u00020\tH\u00c6\u0003J\n\u0010\u009e\u0001\u001a\u00020\tH\u00c6\u0003J\n\u0010\u009f\u0001\u001a\u00020\u0001H\u00c6\u0003J\n\u0010\u00a0\u0001\u001a\u00020\u0001H\u00c6\u0003J\n\u0010\u00a1\u0001\u001a\u00020\u0005H\u00c6\u0003J\u0010\u0010\u00a2\u0001\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007H\u00c6\u0003J\n\u0010\u00a3\u0001\u001a\u00020\u0005H\u00c6\u0003J\n\u0010\u00a4\u0001\u001a\u00020\tH\u00c6\u0003J\n\u0010\u00a5\u0001\u001a\u00020\u0001H\u00c6\u0003J\n\u0010\u00a6\u0001\u001a\u00020\tH\u00c6\u0003J\n\u0010\u00a7\u0001\u001a\u00020\tH\u00c6\u0003J\n\u0010\u00a8\u0001\u001a\u00020\tH\u00c6\u0003J\n\u0010\u00a9\u0001\u001a\u000201H\u00c6\u0003J\n\u0010\u00aa\u0001\u001a\u00020\u0005H\u00c6\u0003J\n\u0010\u00ab\u0001\u001a\u00020\u0001H\u00c6\u0003J\n\u0010\u00ac\u0001\u001a\u00020\tH\u00c6\u0003J\n\u0010\u00ad\u0001\u001a\u00020\u0001H\u00c6\u0003J\n\u0010\u00ae\u0001\u001a\u00020\tH\u00c6\u0003J\n\u0010\u00af\u0001\u001a\u00020\tH\u00c6\u0003J\n\u0010\u00b0\u0001\u001a\u00020\u0001H\u00c6\u0003J\n\u0010\u00b1\u0001\u001a\u00020\u0001H\u00c6\u0003J\n\u0010\u00b2\u0001\u001a\u00020\tH\u00c6\u0003J\n\u0010\u00b3\u0001\u001a\u00020\u0005H\u00c6\u0003J\n\u0010\u00b4\u0001\u001a\u00020\u0005H\u00c6\u0003J\n\u0010\u00b5\u0001\u001a\u00020\u0003H\u00c6\u0003J\n\u0010\u00b6\u0001\u001a\u00020\tH\u00c6\u0003J\n\u0010\u00b7\u0001\u001a\u00020\tH\u00c6\u0003J\n\u0010\u00b8\u0001\u001a\u00020\tH\u00c6\u0003J\n\u0010\u00b9\u0001\u001a\u00020\u0001H\u00c6\u0003J\n\u0010\u00ba\u0001\u001a\u00020\tH\u00c6\u0003J\n\u0010\u00bb\u0001\u001a\u00020\u0001H\u00c6\u0003J\n\u0010\u00bc\u0001\u001a\u00020\u0001H\u00c6\u0003J\n\u0010\u00bd\u0001\u001a\u00020\tH\u00c6\u0003J\n\u0010\u00be\u0001\u001a\u00020\tH\u00c6\u0003J\n\u0010\u00bf\u0001\u001a\u00020\tH\u00c6\u0003J\n\u0010\u00c0\u0001\u001a\u00020\tH\u00c6\u0003J\u00f0\u0004\u0010\u00c1\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\t2\b\b\u0002\u0010\u000f\u001a\u00020\t2\b\b\u0002\u0010\u0010\u001a\u00020\t2\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00012\b\b\u0002\u0010\u0013\u001a\u00020\t2\b\b\u0002\u0010\u0014\u001a\u00020\t2\b\b\u0002\u0010\u0015\u001a\u00020\t2\b\b\u0002\u0010\u0016\u001a\u00020\t2\b\b\u0002\u0010\u0017\u001a\u00020\t2\b\b\u0002\u0010\u0018\u001a\u00020\t2\b\b\u0002\u0010\u0019\u001a\u00020\t2\b\b\u0002\u0010\u001a\u001a\u00020\u00012\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00072\b\b\u0002\u0010\u001d\u001a\u00020\t2\b\b\u0002\u0010\u001e\u001a\u00020\t2\b\b\u0002\u0010\u001f\u001a\u00020\t2\b\b\u0002\u0010 \u001a\u00020\t2\b\b\u0002\u0010!\u001a\u00020\t2\u000e\b\u0002\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\u00072\b\b\u0002\u0010$\u001a\u00020\t2\b\b\u0002\u0010%\u001a\u00020\t2\b\b\u0002\u0010&\u001a\u00020\t2\b\b\u0002\u0010\'\u001a\u00020\u00012\b\b\u0002\u0010(\u001a\u00020\u00012\b\b\u0002\u0010)\u001a\u00020\u00052\u000e\b\u0002\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\b\b\u0002\u0010+\u001a\u00020\u00052\b\b\u0002\u0010,\u001a\u00020\t2\b\b\u0002\u0010-\u001a\u00020\u00012\b\b\u0002\u0010.\u001a\u00020\t2\b\b\u0002\u0010/\u001a\u00020\t2\b\b\u0002\u00100\u001a\u0002012\b\b\u0002\u00102\u001a\u00020\u00052\b\b\u0002\u00103\u001a\u00020\u00012\b\b\u0002\u00104\u001a\u00020\t2\b\b\u0002\u00105\u001a\u00020\u00012\b\b\u0002\u00106\u001a\u00020\t2\b\b\u0002\u00107\u001a\u00020\t2\b\b\u0002\u00108\u001a\u00020\u00012\b\b\u0002\u00109\u001a\u00020\u00012\b\b\u0002\u0010:\u001a\u00020\u00052\b\b\u0002\u0010;\u001a\u00020\u00052\b\b\u0002\u0010<\u001a\u00020\u00032\b\b\u0002\u0010=\u001a\u00020\t2\b\b\u0002\u0010>\u001a\u00020\t2\b\b\u0002\u0010?\u001a\u00020\t2\b\b\u0002\u0010@\u001a\u00020\u00012\b\b\u0002\u0010A\u001a\u00020\t2\b\b\u0002\u0010B\u001a\u00020\u00012\b\b\u0002\u0010C\u001a\u00020\u0001H\u00c6\u0001J\u0015\u0010\u00c2\u0001\u001a\u0002012\t\u0010\u00c3\u0001\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\n\u0010\u00c4\u0001\u001a\u00020\u0005H\u00d6\u0001J\n\u0010\u00c5\u0001\u001a\u00020\tH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bE\u0010FR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bG\u0010HR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\bI\u0010JR\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\bK\u0010LR\u0011\u0010\n\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\bM\u0010LR\u0011\u0010\u000b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\bN\u0010LR\u0011\u0010\f\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\bO\u0010LR\u0011\u0010\r\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\bP\u0010LR\u0011\u0010\u000e\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\bQ\u0010LR\u0011\u0010\u000f\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\bR\u0010LR\u0011\u0010\u0010\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\bS\u0010LR\u0011\u0010\u0011\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bT\u0010FR\u0011\u0010\u0012\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\bU\u0010VR\u0011\u0010\u0013\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\bW\u0010LR\u0011\u0010\u0014\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\bX\u0010LR\u0011\u0010\u0015\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\bY\u0010LR\u0011\u0010\u0016\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\bZ\u0010LR\u0011\u0010\u0017\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b[\u0010LR\u0011\u0010\u0018\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\\\u0010LR\u0011\u0010\u0019\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b]\u0010LR\u0011\u0010\u001a\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b^\u0010VR\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b_\u0010JR\u0011\u0010\u001d\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b`\u0010LR\u0011\u0010\u001e\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\ba\u0010LR\u0011\u0010\u001f\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\bb\u0010LR\u0011\u0010 \u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\bc\u0010LR\u0011\u0010!\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\bd\u0010LR\u0017\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\be\u0010JR\u0011\u0010$\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\bf\u0010LR\u0011\u0010%\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\bg\u0010LR\u0011\u0010&\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\bh\u0010LR\u0011\u0010\'\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\bi\u0010VR\u0011\u0010(\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\bj\u0010VR\u0011\u0010)\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bk\u0010HR\u0017\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\bl\u0010JR\u0011\u0010+\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bm\u0010HR\u0011\u0010,\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\bn\u0010LR\u0011\u0010-\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\bo\u0010VR\u0011\u0010.\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\bp\u0010LR\u0011\u0010/\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\bq\u0010LR\u0011\u00100\u001a\u000201\u00a2\u0006\b\n\u0000\u001a\u0004\br\u0010sR\u0011\u00102\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\bt\u0010HR\u0011\u00103\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\bu\u0010VR\u0011\u00104\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\bv\u0010LR\u0011\u00105\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\bw\u0010VR\u0011\u00106\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\bx\u0010LR\u0011\u00107\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\by\u0010LR\u0011\u00108\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\bz\u0010VR\u0011\u00109\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b{\u0010VR\u0011\u0010:\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b|\u0010HR\u0011\u0010;\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b}\u0010HR\u0011\u0010<\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b~\u0010FR\u0011\u0010=\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u007f\u0010LR\u0012\u0010>\u001a\u00020\t\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0080\u0001\u0010LR\u0012\u0010?\u001a\u00020\t\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0081\u0001\u0010LR\u0012\u0010@\u001a\u00020\u0001\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0082\u0001\u0010VR\u0012\u0010A\u001a\u00020\t\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0083\u0001\u0010LR\u0012\u0010B\u001a\u00020\u0001\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0084\u0001\u0010VR\u0012\u0010C\u001a\u00020\u0001\u00a2\u0006\t\n\u0000\u001a\u0005\b\u0085\u0001\u0010V\u00a8\u0006\u00c6\u0001"}, d2 = {"Lcom/app/network/models/responseModels/TransactionDetails;", "", "AMOUNT", "", "APPROVENUM", "", "APPROVE_DETAIL", "", "BENEFACC", "", "BENEFADDR", "BENEFBANKADDR", "BENEFBANKCODE", "BENEFBANKNAME", "BENEFNAME", "BENEFTAXID", "BICINPUTTYPE", "COMMAMOUNT", "COUNTERCIF", "COUNTERNAME", "CUSTACC", "CUSTACCFORCOM", "CUSTADDR", "CUSTCIF", "CUSTNAME", "CUSTTAXID", "CommCode", "HISTORY_DETAILS", "Lcom/app/network/models/responseModels/HISTORYDETAILS;", "INFOTOBENEF", "INTERMEDBANKADDR", "INTERMEDBANKCODE", "INTERMEDBANKNAME", "NOTE", "PDF_LIST", "Lcom/app/network/models/responseModels/FileDetails;", "PMTCUSTID", "PMTDET", "PMTID", "PMTSYSTEMTYPE", "PMTTYPECODE", "SIGNNUM", "SIGN_DETAIL", "attachedPDF", "authType", "bankNote", "ccy", "ccyType", "createdFromTempl", "", "customerNo", "forceSign", "ibankRef", "id", "phoneNumber", "source", "stepId", "templName", "totalApproverCount", "totalSignerCount", "trnAmount", "trnRequestType", "trnStatus", "trnType", "uniqueRequestId", "userName", "verification", "xref", "(DILjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DLjava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;ILjava/util/List;ILjava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;IIDLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V", "getAMOUNT", "()D", "getAPPROVENUM", "()I", "getAPPROVE_DETAIL", "()Ljava/util/List;", "getBENEFACC", "()Ljava/lang/String;", "getBENEFADDR", "getBENEFBANKADDR", "getBENEFBANKCODE", "getBENEFBANKNAME", "getBENEFNAME", "getBENEFTAXID", "getBICINPUTTYPE", "getCOMMAMOUNT", "getCOUNTERCIF", "()Ljava/lang/Object;", "getCOUNTERNAME", "getCUSTACC", "getCUSTACCFORCOM", "getCUSTADDR", "getCUSTCIF", "getCUSTNAME", "getCUSTTAXID", "getCommCode", "getHISTORY_DETAILS", "getINFOTOBENEF", "getINTERMEDBANKADDR", "getINTERMEDBANKCODE", "getINTERMEDBANKNAME", "getNOTE", "getPDF_LIST", "getPMTCUSTID", "getPMTDET", "getPMTID", "getPMTSYSTEMTYPE", "getPMTTYPECODE", "getSIGNNUM", "getSIGN_DETAIL", "getAttachedPDF", "getAuthType", "getBankNote", "getCcy", "getCcyType", "getCreatedFromTempl", "()Z", "getCustomerNo", "getForceSign", "getIbankRef", "getId", "getPhoneNumber", "getSource", "getStepId", "getTemplName", "getTotalApproverCount", "getTotalSignerCount", "getTrnAmount", "getTrnRequestType", "getTrnStatus", "getTrnType", "getUniqueRequestId", "getUserName", "getVerification", "getXref", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component4", "component40", "component41", "component42", "component43", "component44", "component45", "component46", "component47", "component48", "component49", "component5", "component50", "component51", "component52", "component53", "component54", "component55", "component56", "component57", "component58", "component59", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "data_debug"})
public final class TransactionDetails {
    private final double AMOUNT = 0.0;
    private final int APPROVENUM = 0;
    @org.jetbrains.annotations.NotNull
    private final java.util.List<java.lang.Object> APPROVE_DETAIL = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String BENEFACC = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String BENEFADDR = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String BENEFBANKADDR = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String BENEFBANKCODE = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String BENEFBANKNAME = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String BENEFNAME = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String BENEFTAXID = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String BICINPUTTYPE = null;
    private final double COMMAMOUNT = 0.0;
    @org.jetbrains.annotations.NotNull
    private final java.lang.Object COUNTERCIF = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String COUNTERNAME = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String CUSTACC = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String CUSTACCFORCOM = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String CUSTADDR = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String CUSTCIF = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String CUSTNAME = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String CUSTTAXID = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.Object CommCode = null;
    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.app.network.models.responseModels.HISTORYDETAILS> HISTORY_DETAILS = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String INFOTOBENEF = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String INTERMEDBANKADDR = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String INTERMEDBANKCODE = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String INTERMEDBANKNAME = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String NOTE = null;
    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.app.network.models.responseModels.FileDetails> PDF_LIST = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String PMTCUSTID = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String PMTDET = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String PMTID = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.Object PMTSYSTEMTYPE = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.Object PMTTYPECODE = null;
    private final int SIGNNUM = 0;
    @org.jetbrains.annotations.NotNull
    private final java.util.List<java.lang.Object> SIGN_DETAIL = null;
    private final int attachedPDF = 0;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String authType = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.Object bankNote = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String ccy = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String ccyType = null;
    private final boolean createdFromTempl = false;
    private final int customerNo = 0;
    @org.jetbrains.annotations.NotNull
    private final java.lang.Object forceSign = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String ibankRef = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.Object id = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String phoneNumber = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String source = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.Object stepId = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.Object templName = null;
    private final int totalApproverCount = 0;
    private final int totalSignerCount = 0;
    private final double trnAmount = 0.0;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String trnRequestType = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String trnStatus = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String trnType = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.Object uniqueRequestId = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String userName = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.Object verification = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.Object xref = null;
    
    @org.jetbrains.annotations.NotNull
    public final com.app.network.models.responseModels.TransactionDetails copy(double AMOUNT, int APPROVENUM, @org.jetbrains.annotations.NotNull
    java.util.List<? extends java.lang.Object> APPROVE_DETAIL, @org.jetbrains.annotations.NotNull
    java.lang.String BENEFACC, @org.jetbrains.annotations.NotNull
    java.lang.String BENEFADDR, @org.jetbrains.annotations.NotNull
    java.lang.String BENEFBANKADDR, @org.jetbrains.annotations.NotNull
    java.lang.String BENEFBANKCODE, @org.jetbrains.annotations.NotNull
    java.lang.String BENEFBANKNAME, @org.jetbrains.annotations.NotNull
    java.lang.String BENEFNAME, @org.jetbrains.annotations.NotNull
    java.lang.String BENEFTAXID, @org.jetbrains.annotations.NotNull
    java.lang.String BICINPUTTYPE, double COMMAMOUNT, @org.jetbrains.annotations.NotNull
    java.lang.Object COUNTERCIF, @org.jetbrains.annotations.NotNull
    java.lang.String COUNTERNAME, @org.jetbrains.annotations.NotNull
    java.lang.String CUSTACC, @org.jetbrains.annotations.NotNull
    java.lang.String CUSTACCFORCOM, @org.jetbrains.annotations.NotNull
    java.lang.String CUSTADDR, @org.jetbrains.annotations.NotNull
    java.lang.String CUSTCIF, @org.jetbrains.annotations.NotNull
    java.lang.String CUSTNAME, @org.jetbrains.annotations.NotNull
    java.lang.String CUSTTAXID, @org.jetbrains.annotations.NotNull
    java.lang.Object CommCode, @org.jetbrains.annotations.NotNull
    java.util.List<com.app.network.models.responseModels.HISTORYDETAILS> HISTORY_DETAILS, @org.jetbrains.annotations.NotNull
    java.lang.String INFOTOBENEF, @org.jetbrains.annotations.NotNull
    java.lang.String INTERMEDBANKADDR, @org.jetbrains.annotations.NotNull
    java.lang.String INTERMEDBANKCODE, @org.jetbrains.annotations.NotNull
    java.lang.String INTERMEDBANKNAME, @org.jetbrains.annotations.NotNull
    java.lang.String NOTE, @org.jetbrains.annotations.NotNull
    java.util.List<com.app.network.models.responseModels.FileDetails> PDF_LIST, @org.jetbrains.annotations.NotNull
    java.lang.String PMTCUSTID, @org.jetbrains.annotations.NotNull
    java.lang.String PMTDET, @org.jetbrains.annotations.NotNull
    java.lang.String PMTID, @org.jetbrains.annotations.NotNull
    java.lang.Object PMTSYSTEMTYPE, @org.jetbrains.annotations.NotNull
    java.lang.Object PMTTYPECODE, int SIGNNUM, @org.jetbrains.annotations.NotNull
    java.util.List<? extends java.lang.Object> SIGN_DETAIL, int attachedPDF, @org.jetbrains.annotations.NotNull
    java.lang.String authType, @org.jetbrains.annotations.NotNull
    java.lang.Object bankNote, @org.jetbrains.annotations.NotNull
    java.lang.String ccy, @org.jetbrains.annotations.NotNull
    java.lang.String ccyType, boolean createdFromTempl, int customerNo, @org.jetbrains.annotations.NotNull
    java.lang.Object forceSign, @org.jetbrains.annotations.NotNull
    java.lang.String ibankRef, @org.jetbrains.annotations.NotNull
    java.lang.Object id, @org.jetbrains.annotations.NotNull
    java.lang.String phoneNumber, @org.jetbrains.annotations.NotNull
    java.lang.String source, @org.jetbrains.annotations.NotNull
    java.lang.Object stepId, @org.jetbrains.annotations.NotNull
    java.lang.Object templName, int totalApproverCount, int totalSignerCount, double trnAmount, @org.jetbrains.annotations.NotNull
    java.lang.String trnRequestType, @org.jetbrains.annotations.NotNull
    java.lang.String trnStatus, @org.jetbrains.annotations.NotNull
    java.lang.String trnType, @org.jetbrains.annotations.NotNull
    java.lang.Object uniqueRequestId, @org.jetbrains.annotations.NotNull
    java.lang.String userName, @org.jetbrains.annotations.NotNull
    java.lang.Object verification, @org.jetbrains.annotations.NotNull
    java.lang.Object xref) {
        return null;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String toString() {
        return null;
    }
    
    public TransactionDetails(double AMOUNT, int APPROVENUM, @org.jetbrains.annotations.NotNull
    java.util.List<? extends java.lang.Object> APPROVE_DETAIL, @org.jetbrains.annotations.NotNull
    java.lang.String BENEFACC, @org.jetbrains.annotations.NotNull
    java.lang.String BENEFADDR, @org.jetbrains.annotations.NotNull
    java.lang.String BENEFBANKADDR, @org.jetbrains.annotations.NotNull
    java.lang.String BENEFBANKCODE, @org.jetbrains.annotations.NotNull
    java.lang.String BENEFBANKNAME, @org.jetbrains.annotations.NotNull
    java.lang.String BENEFNAME, @org.jetbrains.annotations.NotNull
    java.lang.String BENEFTAXID, @org.jetbrains.annotations.NotNull
    java.lang.String BICINPUTTYPE, double COMMAMOUNT, @org.jetbrains.annotations.NotNull
    java.lang.Object COUNTERCIF, @org.jetbrains.annotations.NotNull
    java.lang.String COUNTERNAME, @org.jetbrains.annotations.NotNull
    java.lang.String CUSTACC, @org.jetbrains.annotations.NotNull
    java.lang.String CUSTACCFORCOM, @org.jetbrains.annotations.NotNull
    java.lang.String CUSTADDR, @org.jetbrains.annotations.NotNull
    java.lang.String CUSTCIF, @org.jetbrains.annotations.NotNull
    java.lang.String CUSTNAME, @org.jetbrains.annotations.NotNull
    java.lang.String CUSTTAXID, @org.jetbrains.annotations.NotNull
    java.lang.Object CommCode, @org.jetbrains.annotations.NotNull
    java.util.List<com.app.network.models.responseModels.HISTORYDETAILS> HISTORY_DETAILS, @org.jetbrains.annotations.NotNull
    java.lang.String INFOTOBENEF, @org.jetbrains.annotations.NotNull
    java.lang.String INTERMEDBANKADDR, @org.jetbrains.annotations.NotNull
    java.lang.String INTERMEDBANKCODE, @org.jetbrains.annotations.NotNull
    java.lang.String INTERMEDBANKNAME, @org.jetbrains.annotations.NotNull
    java.lang.String NOTE, @org.jetbrains.annotations.NotNull
    java.util.List<com.app.network.models.responseModels.FileDetails> PDF_LIST, @org.jetbrains.annotations.NotNull
    java.lang.String PMTCUSTID, @org.jetbrains.annotations.NotNull
    java.lang.String PMTDET, @org.jetbrains.annotations.NotNull
    java.lang.String PMTID, @org.jetbrains.annotations.NotNull
    java.lang.Object PMTSYSTEMTYPE, @org.jetbrains.annotations.NotNull
    java.lang.Object PMTTYPECODE, int SIGNNUM, @org.jetbrains.annotations.NotNull
    java.util.List<? extends java.lang.Object> SIGN_DETAIL, int attachedPDF, @org.jetbrains.annotations.NotNull
    java.lang.String authType, @org.jetbrains.annotations.NotNull
    java.lang.Object bankNote, @org.jetbrains.annotations.NotNull
    java.lang.String ccy, @org.jetbrains.annotations.NotNull
    java.lang.String ccyType, boolean createdFromTempl, int customerNo, @org.jetbrains.annotations.NotNull
    java.lang.Object forceSign, @org.jetbrains.annotations.NotNull
    java.lang.String ibankRef, @org.jetbrains.annotations.NotNull
    java.lang.Object id, @org.jetbrains.annotations.NotNull
    java.lang.String phoneNumber, @org.jetbrains.annotations.NotNull
    java.lang.String source, @org.jetbrains.annotations.NotNull
    java.lang.Object stepId, @org.jetbrains.annotations.NotNull
    java.lang.Object templName, int totalApproverCount, int totalSignerCount, double trnAmount, @org.jetbrains.annotations.NotNull
    java.lang.String trnRequestType, @org.jetbrains.annotations.NotNull
    java.lang.String trnStatus, @org.jetbrains.annotations.NotNull
    java.lang.String trnType, @org.jetbrains.annotations.NotNull
    java.lang.Object uniqueRequestId, @org.jetbrains.annotations.NotNull
    java.lang.String userName, @org.jetbrains.annotations.NotNull
    java.lang.Object verification, @org.jetbrains.annotations.NotNull
    java.lang.Object xref) {
        super();
    }
    
    public final double component1() {
        return 0.0;
    }
    
    public final double getAMOUNT() {
        return 0.0;
    }
    
    public final int component2() {
        return 0;
    }
    
    public final int getAPPROVENUM() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.Object> component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.Object> getAPPROVE_DETAIL() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getBENEFACC() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getBENEFADDR() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getBENEFBANKADDR() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getBENEFBANKCODE() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getBENEFBANKNAME() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getBENEFNAME() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getBENEFTAXID() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component11() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getBICINPUTTYPE() {
        return null;
    }
    
    public final double component12() {
        return 0.0;
    }
    
    public final double getCOMMAMOUNT() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.Object component13() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.Object getCOUNTERCIF() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component14() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getCOUNTERNAME() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component15() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getCUSTACC() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component16() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getCUSTACCFORCOM() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component17() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getCUSTADDR() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component18() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getCUSTCIF() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component19() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getCUSTNAME() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component20() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getCUSTTAXID() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.Object component21() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.Object getCommCode() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.app.network.models.responseModels.HISTORYDETAILS> component22() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.app.network.models.responseModels.HISTORYDETAILS> getHISTORY_DETAILS() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component23() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getINFOTOBENEF() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component24() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getINTERMEDBANKADDR() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component25() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getINTERMEDBANKCODE() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component26() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getINTERMEDBANKNAME() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component27() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getNOTE() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.app.network.models.responseModels.FileDetails> component28() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.app.network.models.responseModels.FileDetails> getPDF_LIST() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component29() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getPMTCUSTID() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component30() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getPMTDET() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component31() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getPMTID() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.Object component32() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.Object getPMTSYSTEMTYPE() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.Object component33() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.Object getPMTTYPECODE() {
        return null;
    }
    
    public final int component34() {
        return 0;
    }
    
    public final int getSIGNNUM() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.Object> component35() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.Object> getSIGN_DETAIL() {
        return null;
    }
    
    public final int component36() {
        return 0;
    }
    
    public final int getAttachedPDF() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component37() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getAuthType() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.Object component38() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.Object getBankNote() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component39() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getCcy() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component40() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getCcyType() {
        return null;
    }
    
    public final boolean component41() {
        return false;
    }
    
    public final boolean getCreatedFromTempl() {
        return false;
    }
    
    public final int component42() {
        return 0;
    }
    
    public final int getCustomerNo() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.Object component43() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.Object getForceSign() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component44() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getIbankRef() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.Object component45() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.Object getId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component46() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getPhoneNumber() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component47() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getSource() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.Object component48() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.Object getStepId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.Object component49() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.Object getTemplName() {
        return null;
    }
    
    public final int component50() {
        return 0;
    }
    
    public final int getTotalApproverCount() {
        return 0;
    }
    
    public final int component51() {
        return 0;
    }
    
    public final int getTotalSignerCount() {
        return 0;
    }
    
    public final double component52() {
        return 0.0;
    }
    
    public final double getTrnAmount() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component53() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getTrnRequestType() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component54() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getTrnStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component55() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getTrnType() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.Object component56() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.Object getUniqueRequestId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component57() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getUserName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.Object component58() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.Object getVerification() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.Object component59() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.Object getXref() {
        return null;
    }
}