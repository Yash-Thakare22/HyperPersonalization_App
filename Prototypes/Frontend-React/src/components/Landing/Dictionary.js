import React from 'react';
import DictionaryCard from '../auth/DictionaryCard';
import { dictionaryCardArray } from '../../utils/dummy';

export const Dictionary = () => {
    return (
        <div>
            <div className="flexGrid">
                {dictionaryCardArray.map((dcard) => (
                    <DictionaryCard
                        title={dcard.title}
                        pronounciation={dcard.pronounciation}
                        figuresofspeech={dcard.figuresofspeech}
                        meaning={dcard.meaning}
                    />
                ))}
            </div>
        </div>
    )
}

export default Dictionary;
