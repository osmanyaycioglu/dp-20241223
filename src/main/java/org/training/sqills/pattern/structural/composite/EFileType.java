package org.training.sqills.pattern.structural.composite;

import org.jboss.resteasy.reactive.common.NotImplementedYet;

public enum EFileType {
    DIR {
        @Override
        public AbstractFile getInstance(String name) {
            return new Folder(name);
        }
    },
    FILE {
        @Override
        public AbstractFile getInstance(String name) {
            return new File(name);
        }
    };

    public AbstractFile getInstance(String name) {
        throw new NotImplementedYet();
    }
}
