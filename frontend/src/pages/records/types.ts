export type RecordsResponse = {
    content: RecordItem[];
    totalPages: number;
}

export type RecordItem = {
    id: number;
    moment: string;
    name: string;
    age: number;
    gamePlatform: Plataform;
    gameTitle: string;
    genreName: string;
}

export type Plataform = 'XBOX' | 'PC' | 'PLAYSTATION'